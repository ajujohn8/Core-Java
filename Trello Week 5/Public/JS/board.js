import Component from './component.js';
import TaskLists from './tasklist.js';

export default class Board extends Component {
    constructor(config, container) {
        super();
        this.setContainer(container);
        this.name = config.name;
        this.taskLists = config.taskLists.map(taskListsConfig => new TaskLists(taskListsConfig));
        // console.log(this.taskLists.id)

    }


    getTaskListById( id /*: number | string */ ) {
        // console.log(this.taskLists.id);
        return this.taskLists.find( taskList => taskList.id == id );
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
       <div class="second-nav">
         <div class="board-title"></div>
            <div class="sm pointer">
              <i class="fas fa-ellipsis-v"></i>
              Show menu
            
                    <div class="dropdown-content hide" id="myDropdown">
                        <a href="#" class="save-board"> 
                            <i class="fas fa-save"></i>
                                Save board
                        </a>
                        <a href="#" class="delete-board"> 
                        <i class="fas fa-times"></i>
                        Delete selected task
                        </a>
                        <a href="#" class="board-show-menu-item move-selected-task pointer">
                        <i class="fas fa-arrows-alt"></i>
                        Move selected task
                        </a>
                    </div>
                                                                            
                     
                
                
            </div>
        </div>    
        <div class="task-lists">
            <div class="task-lists-wrapper">
            </div> 
        </div>     
        `;
        
        // </div>
               // <div class = "dropdown-contents>
        // <div class="dropdown-content delete-selected-task pointer">
//     <i class="fas fa-times"></i>
//         Delete selected task
 // </div>
        this.container.querySelector( '.sm' ).addEventListener( 'click', function() {
            if( !this.parentNode.classList.contains( 'show-menu' ) ) {
                this.parentNode.classList.add( 'show-menu' );
            } else {
                this.parentNode.classList.remove( 'show-menu' );
            }
        });
        this.container.querySelector('.sm').addEventListener('click', (event)=>{
            this.container.querySelector('.dropdown-content').classList.toggle('hide');
        });
        this.container.querySelector( '.dropdown-content' ).addEventListener( 'click', () => {
            const selectedTaskEl = document.querySelector( '.input-box.selected' );
            const selectedTaskListEl = document.querySelector( '.bulletin-container.selected-task-list' );
            // console.log(selectedTaskListEl);
            
            let selectedTaskList;
        

            if( selectedTaskEl ) {
                
                selectedTaskList = this.getTaskListById( selectedTaskListEl.parentNode.id.split( '-' )[1] );
                selectedTaskList.removeTaskById( selectedTaskEl.parentNode.id.split( '-' )[1] );
            }
        });

        this.container.querySelector( '.save-board' ).addEventListener( 'click', () => {
            localStorage.setItem( 'board', JSON.stringify({
                name: this.name,
                taskLists: this.taskLists
            }));
        });
        this.renderTaskLists(this.container.querySelector('.task-lists-wrapper'));
       

    }
    renderTaskLists(container) {
        // console.log(this.taskLists);
        this.taskLists.forEach(this.renderTaskList.bind(this, container));
        const addTaskListWrapper = document.createElement('div');
        addTaskListWrapper.classList.add('add-task-list-wrapper');
        container.appendChild(addTaskListWrapper);

        this.renderAddTaskList(addTaskListWrapper);
    }

    renderTaskList(container, taskLists) {
        const taskListWrapperOuter = document.createElement('div');
        taskListWrapperOuter.classList.add('task-list-wrapper');

        const taskListWrapper = document.createElement('div');
        taskListWrapper.id = `component-${taskLists.id}`;
        taskListWrapper.classList.add('tasklist-wrapper');

        taskListWrapperOuter.appendChild(taskListWrapper);

        const onDragenterOrDragover = function (event) {
            event.preventDefault();
            taskListWrapper.classList.add('task-list-is-dragged-over');
        }

        const onDragLeaveOrDrop = function (event) {
            taskListWrapper.classList.remove('task-list-is-dragged-over');
        }

        taskListWrapper.addEventListener('dragenter', onDragenterOrDragover);
        taskListWrapper.addEventListener('dragover', onDragenterOrDragover);
        taskListWrapper.addEventListener('dragover',() => {
        if(!this.container.querySelector('.task-list-with-task-is-dragged')){
            taskListWrapper.classList.add('task-list-with-task-is-dragged');
        }
        });

        taskListWrapper.addEventListener('dragleave',onDragLeaveOrDrop);
        taskListWrapper.addEventListener('drop',event =>{
            const taskElIsDragged = document.querySelector('.task-is-dragged');
            const taskELIsDraggedOver = document.querySelector('.task-is-dragged-over');
            const taslListELWithTaskIsDragged = document.querySelector('.task-list-with-task-is-dragged');
            const taslListELIsraggedOver = document.querySelector('.task-list-is-dragged-over');
       
            if(!taslListELIsraggedOver){
                return;
            }

            const taskListWtihTaskIsDragged = this.getTaskListById(taslListELWithTaskIsDragged.id.split( '-')[1]);
            const taskListIsDraggedOver = this.getTaskListById(taslListELIsraggedOver.id.split('-')[1]);

            const idTaskIsDragged = parseInt(taskElIsDragged.id.split('-')[1]);
            let idTaskIsDraggedOver = null;
            if(taskELIsDraggedOver){
                idTaskIsDraggedOver = parseInt(taskELIsDraggedOver.id.split('-')[1]);
            }

            const taskIsDragged = taskListWtihTaskIsDragged.removeTaskById(idTaskIsDragged);
            taskListIsDraggedOver.addTaskAfter(taskIsDragged,idTaskIsDraggedOver);

            taslListELWithTaskIsDragged.classList.remove('task-list-with-task-is-dragged');
            
        });
        taskListWrapper.addEventListener('drop',onDragLeaveOrDrop);
        



        container.appendChild(taskListWrapperOuter);

        taskLists.setContainer(taskListWrapper);
        taskLists.render();
    }

    renderAddTaskList(container) {
        let addListMessage, addListForm;

        if (this.taskLists.length === 0) {
            addListMessage = `<div class="add-list-message pointer">+ Add list</div>`;
        } else {
            addListMessage = `<div class="add-list-message pointer">+ Add another list</div>`;
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
                    task: []
                }));
            }
        });
    }

    pushTaskList(taskLists) {
        this.taskLists.push(taskLists);
        this.render();
    }
}