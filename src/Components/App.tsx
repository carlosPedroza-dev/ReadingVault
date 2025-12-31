import '../css/globalcss.css';
import VNav from './navbar';
import BooksDisplay from './booksDisplay';
export default function App(){
    return(
<div className='flex'>
<VNav/>
<BooksDisplay/>
</div>
    );
}