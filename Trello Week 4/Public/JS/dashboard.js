import {boardConfig} from "./data.js";

class Component{
    setContainer(container){
        this.container = container;
        this.render();
    }
    render(){
        return;
    }
}

class Task extends Component{
    constructor(config){
        super();
        this.name = config.name;
        this.due = config.due;

    }

    render(){
        
        const template =`
            
            <div class="input-box pointer font-container input-bar task-input input-box-edit">
               <span >${this.name}</span>
                <i class="fas fa-pencil-alt pencil"></i> 
            </div>
            <form class="hide edit-task-form">
                <textarea rows="3" placeholder="${this.name}"class="big-input-box placeholderValue"></textarea> 
                <i class="fas fa-2x fa-times button-x-font edit-task-cancel pointer"></i>
                <button class="btn btn-inline btn-primary pushed pointer">Update Task</button>
            </form>
            
        `;
   
        this.container.innerHTML = template;
        this.container.querySelector('.fa-pencil-alt').addEventListener('click',()=>{
            this.container.querySelector('.edit-task-form').classList.remove('hide');
            this.container.querySelector('.task-input').classList.add('hide');
        });
        this.container.querySelector('.pushed').addEventListener('click', (event)=>{
            event.preventDefault();
            const taskText = this.container.querySelector( '.placeholderValue' ).value;
            console.log(this.name);
            this.name=this.container.querySelector('.placeholderValue').value; 
            console.log(this.name);
            this.container.querySelector('.task-input span').innerHTML = this.name;
            this.container.querySelector('.task-input').classList.remove('hide');
            this.container.querySelector('.edit-task-form').classList.add('hide');  
        });
        this.container.querySelector('.edit-task-cancel').addEventListener('click',()=>{
            this.container.querySelector('.task-input ').classList.remove('hide');
            this.container.querySelector('.edit-task-form').classList.add('hide');
        });
    
    }
}
class Tasks extends Component{
    constructor(config){
        super();
        this.name = config.name;
        this.tasks = config.tasks.map(task => new Task(task));
    }
    renderTask = (task,idx)=>{
        const wrapper = document.createElement('div');
        wrapper.classList.add(`edit`);
        wrapper.setAttribute('id',`task-${this.name}-${idx}`);
        this.editwrapper.appendChild(wrapper);
        task.setContainer(wrapper);
    }
    a
    render(){
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
        this.tasks.forEach(this.renderTask);
       
        this.container.querySelector('.add-card').addEventListener('click',()=>{
            
            this.container.querySelector('.add-task-form').classList.remove('hide');
            this.container.querySelector('.add-card').classList.add('hide');
        });

        this.container.querySelector('.add-task-form').addEventListener('submit',event=>{
            event.preventDefault();
            console.log(this.container.querySelector('.placeholderValue2').value);
            const taskText1 = this.container.querySelector('.placeholderValue2').value;
            
            console.log(taskText1);
            const taskText = new Task({
                name: this.container.querySelector('.placeholderValue2').value
            });
            console.log(this.taskText);
            // console.log(this.tasks.task);
            console.log(this);
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
}

class TaskLists extends Component{
    constructor(config,container){
        super();
        this.name = config.name;
        this.taskLists = config.taskLists.map(tasks => new Tasks(tasks));
        console.log(this.taskLists)
    }

    renderTaskList(tasks,idx){
        const wrapper = document.createElement('div');
        wrapper.classList.add(`tasklist-conatiner`);
        wrapper.setAttribute('id',`tasks-${this.name}-${idx}`);
        this.container.appendChild(wrapper);    
        tasks.setContainer(wrapper);
    } 
    render(){
        const template =`
        <div class="board"> 
            <div class="task-lists-wrapper">
            </div>
        </div> 
        `;
        this.container.innerHTML= template;
        this.taskLists.forEach( this.renderTaskList );
         this.renderTaskLists(this.container.querySelector('.task-lists-wrapper'));

    }

    

    renderTaskLists(container){
        this.taskLists.forEach(this.renderTaskList.bind(this,container));
        const addTaskListWrapper = document.createElement('div');
        addTaskListWrapper.classList.add('add-task-list-wrapper');
        this.container.appendChild(addTaskListWrapper);
        this.renderAddTaskList(addTaskListWrapper);
    }
    renderTaskList(container, tasks) {
        const taskListWrapperOuter = document.createElement('div');
        taskListWrapperOuter.classList.add('task-list-wrapper');
        const taskListWrapper = document.createElement('div');
        taskListWrapper.id = `component-${tasks.name}`;
        taskListWrapper.classList.add('tasklist-wrapper');
        taskListWrapperOuter.appendChild(taskListWrapper);
        this.container.appendChild(taskListWrapperOuter);
        tasks.setContainer(taskListWrapper);
        tasks.render();
    }

    renderAddTaskList(container) {
        let addListMessage, addListForm;
        console.log
        if (this.taskLists.length === 0) {
            addListMessage = `<div class="add-list-message pointer">+ Add list</div>`;
        } else {
            addListMessage = `<div class="add-list-message pointer">+ Add another list</div>`;
        }

        addListForm = `
            <div class="add-list-form hide">
                
                <form>
                <textarea rows="3" placeholder="Enter a title for this card..." class="big-input-box placeholderValue2"></textarea>
                <div class="add-task-form-actions ">
                    <button class="btn btn-inline btn-primary pushed add-card-button pointer">Add Card</button>
                    <i class="fas fa-2x fa-times add-card-cancel button-x-font  pointer"></i>
                </div>
            </form>
            </div>
        `;

        this.container.innerHTML = `
            <div class="add-list">
                ${addListMessage}
                ${addListForm}
            </div>
        `;

        this.container.querySelector('.add-list-message').addEventListener('click', function () {
            container.querySelector('.add-list-message').classList.add('hide');
            container.querySelector('.add-list-form').classList.remove('hide');
        });

            // this.container.querySelector('.add-list-cancel').addEventListener('click', function () {
            //     container.querySelector('.add-list-form').taskLists.add('hide');
            //     container.querySelector('.add-list-message').taskLists.remove('hide');
            // });

        this.container.querySelector('.pushed').addEventListener('click', (event) => {
            event.preventDefault();
            const taskListText = container.querySelector('.placeholderValue2').value;
            if (taskListText.trim() !== '') {
                this.pushTaskList(new Tasks({
                    name: taskListText,
                    task: []
                }));
            }
        });
    }

    pushTaskList(tasks) {
        this.tasks.push(tasks);
        this.render();
    }
    

    pushTaskList(tasks) {
        this.tasks.push(tasks);
        this.render();
    }
}



const taskLists = new TaskLists(boardConfig);
taskLists.setContainer(document.querySelector('.board'));