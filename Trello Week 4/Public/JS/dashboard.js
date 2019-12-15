import Board from './board.js';
import {boardConfig} from "./data.js";


const board = new Board( boardConfig, document.querySelector( '.board' ) );
board.render();

console.log( board ); 