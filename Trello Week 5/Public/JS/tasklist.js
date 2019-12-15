import Component from './component.js';
import Task from './task.js';

export default class TaskLists extends Component {
    constructor(config) {
        super();
        this.name = config.name;
        this.task = config.task.map(taskConfig => new Task(taskConfig));
        // console.log(this.task.id);
        
    }

    getTaskById( id /*: number | string */ ) {
        return this.task.find( task => task.id == id );
    }
    

    renderTask(task, container) {
        const wrapper = document.createElement('div');
        wrapper.id = `component-${task.id}`;
        wrapper.classList.add(`edit`);
        // wrapper.setAttribute('id', `task-${this.name}`);
        wrapper.setAttribute('draggable',true);

        wrapper.addEventListener('dragstart', function (event) {
            this.classList.add('task-is-dragged')
        });

        wrapper.addEventListener('dragenter', function (event) {
            this.classList.add('task-is-dragged-over');
        });

        wrapper.addEventListener('dragleave', function (event) {
            this.classList.remove('task-is-dragged-over')
        })
        
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
        this.task.forEach(this.renderTask.bind(this));

        this.container.querySelector( '.bulletin-container' ).addEventListener( 'click', function() {
            // console.log('hello');
            
            const isSelected = this.classList.contains( 'selected-task-list' );
            document.querySelectorAll( '.selected-task-list' ).forEach( node => node.classList.remove( 'selected-task-list' ) );
            if( !isSelected ) {
                this.classList.add( 'selected-task-list' );
            } else {
                this.classList.remove( 'selected-task-list' );
            }
            const selectedTaskListEl = document.querySelector( '.bulletin-container.selected-task-list' );
            // console.log(selectedTaskListEl);
        });


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
            this.task.push(taskText);
            this.renderTask(taskText, this.task.length-1);
            this.container.querySelector('.add-card').classList.remove('hide');
            this.container.querySelector('.add-task-form').classList.add('hide');
        });
        this.container.querySelector('.add-card-cancel').addEventListener('click',() =>{
            this.container.querySelector('.add-card').classList.remove('hide');
            this.container.querySelector('.add-task-form').classList.add('hide');
        });
    }


    pushTask(task) {
        this.task.push(task);
        this.render();
    }
    removeTaskById( id ) {
        const idx = this.task.findIndex( task => task.id == id );
        const task = this.task.splice( idx, 1 )[0];
        
        this.render();

        return task;
    }

    addTaskAfter( task, id ) {
        if( id ) {
            const idx = this.task.findIndex( task => task.id == id );
            this.task.splice( idx + 1, 0, task );
        } else {
            this.task.push( task );
        }

        this.render();
    }


}