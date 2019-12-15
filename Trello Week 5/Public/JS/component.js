//import {boardConfig} from "./data.js";
export default class Component {
    constructor(){
        this.id = Component.getNextId();
        // console.log(this.id);
        
    }

    static getNextId(){
        this.id++;
        return this.id;
    }

    setContainer(container) {
    this.container = container;
    //this.render();
    
    }
    render() {
    return;
    }
}
Component.id = 0;