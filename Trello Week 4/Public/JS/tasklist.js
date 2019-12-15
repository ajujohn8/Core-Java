import Component from './component.js';
import Task from './task.js';

export default class TaskLists extends Component {
    constructor(config,) {
        super();
        this.name = config.name;
        // console.log(this.name);
        this.tasks = config.tasks.map(taskConfig => new Task(taskConfig));
    }

    renderTask(task) {
        const wrapper = document.createElement('div');
        wrapper.classList.add(`edit`);
        wrapper.setAttribute('id', `task-${this.name}`);

        this.editwrapper.appendChild(wrapper);
        task.setContainer(wrapper);  
        task.render();
    }
   
    render() {
        const template =`
            <div class="bulletin-container">
                <div class="title-threedots-main">
                    <span class="title-task font-container">${this.name}</span> 
                    <span class="pointer font-container">...</span>
                </div>
                <div class="edit "></div>
                
                <span class="pointer font-container add-card">+ Add another card</span>
                <form class="hide add-task-form">
                    <textarea rows="3" placeholder="Enter a title for this card..." class="big-input-box placeholderValue2"></textarea>
                    <div class="add-task-form-actions ">
                        <button class="btn btn-inline btn-primary pushed add-card-button pointer">Add Card</button>
                        <i class="fas fa-2x fa-times add-card-cancel button-x-font  pointer"></i>
                    </div>
                </form>
            </div>
           
        `;

        this.container.innerHTML = template;
        this.editwrapper = this.container.querySelector('.edit');
        this.tasks.forEach(this.renderTask.bind(this));

        this.container.querySelector('.add-card').addEventListener('click',()=>{
            
            this.container.querySelector('.add-task-form').classList.remove('hide');
            this.container.querySelector('.add-card').classList.add('hide');
        });

        this.container.querySelector('.add-task-form').addEventListener('submit',event=>{
            event.preventDefault();
            // console.log(this.container.querySelector('.placeholderValue2').value);
            const taskText1 = this.container.querySelector('.placeholderValue2').value;
            
            // console.log(taskText1);
            const taskText = new Task({
                name: this.container.querySelector('.placeholderValue2').value
            });
            // console.log(this.taskText);
            // console.log(this.task.task);
            // console.log(this);
            this.tasks.push(taskText);
            console.log(this.tasks.length);
            this.renderTask(taskText, this.tasks.length-1);
            this.container.querySelector('.add-card').classList.remove('hide');
            this.container.querySelector('.add-task-form').classList.add('hide');
        });
        this.container.querySelector('.add-card-cancel').addEventListener('click',() =>{
            this.container.querySelector('.add-card').classList.remove('hide');
            this.container.querySelector('.add-task-form').classList.add('hide');
        });
    }


    pushTask(tasks) {
        this.tasks.push(tasks);
        this.render();
    }


}