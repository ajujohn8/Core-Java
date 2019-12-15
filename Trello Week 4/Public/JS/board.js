import Component from './component.js';
import TaskLists from './tasklist.js';

export default class Board extends Component {
    constructor(config, container) {
        super();
        this.setContainer(container);
        this.name = config.name;
        this.taskLists = config.taskLists.map(taskListsConfig => new TaskLists(taskListsConfig));
        // console.log(this.taskLists);
    }
    renderTaskList(taskLists, idx) {
        const wrapper = document.createElement('div');
        wrapper.classList.add(`tasklist-container`);
        wrapper.setAttribute('id', `tasklist-${this.name}-${idx}`);
        this.tasklistwrapper.appendChild(wrapper);
        task.setContainer(wrapper);
    }

    render() {
        this.container.innerHTML = `
           
        <div class="task-lists-wrapper">
        </div>    
        `;
        this.renderTaskLists(this.container.querySelector('.task-lists-wrapper'));
       

    }
    renderTaskLists(container) {
        this.taskLists.forEach(this.renderTaskList.bind(this, container));
        const addTaskListWrapper = document.createElement('div');
        addTaskListWrapper.classList.add('task-list-wrapper');
        container.appendChild(addTaskListWrapper);

        this.renderAddTaskList(addTaskListWrapper);
    }

    renderTaskList(container, taskLists) {
        const taskListWrapperOuter = document.createElement('div');
        taskListWrapperOuter.classList.add('task-list-wrapper');

        const taskListWrapper = document.createElement('div');
        taskListWrapper.id = `component-${taskLists.name}`;
        taskListWrapper.classList.add('tasklist-wrapper');

        taskListWrapperOuter.appendChild(taskListWrapper);

        container.appendChild(taskListWrapperOuter);

        taskLists.setContainer(taskListWrapper);
        taskLists.render();
    }

    renderAddTaskList(container) {
        let addListMessage, addListForm;

        if (this.taskLists.length === 0) {
            addListMessage = `<div class="add-list-message pointer">+ Add list</div>`;
        } else {
            addListMessage = `<div class="add-list-message task-lists-wrapper pointer">+ Add another list</div>`;
        }

        addListForm = `
            <div class="add-list-form hide">
                <form>
                    <textarea rows="3" placeholder="Enter a title for this card..." class="add-list-input big-input-box"></textarea>
                    <div class="add-list-form-actions">
                        <button class="btn btn-inline btn-primary add-list-button pointer">Add List</button>
                        <i class="fas fa-2x fa-times add-list-cancel pointer"></i>
                    </div>
                </form>
            </div>
        `;

        container.innerHTML = `
            <div class="add-list">
                ${addListMessage}
                ${addListForm}
            </div>
        `;

        container.querySelector('.add-list-message').addEventListener('click', function () {
            container.querySelector('.add-list-message').classList.add('hide');
            container.querySelector('.add-list-form').classList.remove('hide');
        });

        container.querySelector('.add-list-cancel').addEventListener('click', function () {
            container.querySelector('.add-list-form').classList.add('hide');
            container.querySelector('.add-list-message').classList.remove('hide');
        });

        container.querySelector('.add-list-button').addEventListener('click', (event) => {
            event.preventDefault();
            const taskListText = container.querySelector('.add-list-input').value;
            if (taskListText.trim() !== '') {
                this.pushTaskList(new TaskLists({
                    name: taskListText,
                    tasks: []
                }));
            }
        });
    }

    pushTaskList(taskLists) {
        this.taskLists.push(taskLists);
        this.render();
    }
}