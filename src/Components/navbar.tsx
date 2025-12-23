import '../css/globalcss.css';

export default function VerticalNavbar(){
    return(
<nav className='bg-teal-500 h-screen w-64'>
    <ul className='flex flex-col gap-2 p-4'>
        <li><a className='block rounded' href="">Profile</a></li>
        <li><a href="">Books</a></li>
        <li><a href="">Mangas</a></li>
        <li><a href="">Comics</a></li>
    </ul>
</nav>
    );
}