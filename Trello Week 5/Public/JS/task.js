
import Component from './component.js';


export default class Task extends Component {
    constructor(config) {
        super();
        this.name = config.name;
        this.due = config.due;
        // console.log(Task.id);
    
    }

    update(config){
        Object.assign(this,config);
        this.render();
    }

    render() {
        const template = `
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

        this.container.querySelector('.input-box').addEventListener('click', function(){
            const isSelected = this.classList.contains('selected');
            document.querySelectorAll('.selected').forEach(node => node.classList.remove('selected'));
            if(!isSelected){
                this.classList.add('selected');
            } else {
                this.classList.remove('selected');
            }
        });

        this.container.querySelector('.fa-pencil-alt').addEventListener('click', () => {
            this.container.querySelector('.edit-task-form').classList.remove('hide');
            this.container.querySelector('.task-input').classList.add('hide');
        });
        this.container.querySelector('.pushed').addEventListener('click', (event)=>{
            event.preventDefault();
            const taskText = this.container.querySelector( '.placeholderValue' ).value;
            // console.log(this.name);
            this.name=this.container.querySelector('.placeholderValue').value; 
            // console.log(this.name);
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

Task.id = 1;