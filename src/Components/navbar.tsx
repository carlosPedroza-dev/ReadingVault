import '../css/globalcss.css';

export default function VerticalNavbar(){
    return(
<nav className='bg-teal-500 h-screen w-64'>
    <ul className='flex flex-col gap-5 p-4 '>
        <li><a className='block rounded  hover:bg-blue-950' href="">Profile</a></li>
        <li className=' hover:bg-blue-950'><a href="">Books</a></li>
        <li className=' hover:bg-blue-950'><a href="">Mangas</a></li>
        <li className=' hover:bg-blue-950'><a href="">Comics</a></li>
    </ul>
</nav>
    );
}