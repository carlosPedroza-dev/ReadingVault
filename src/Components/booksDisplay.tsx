import '../css/globalcss.css';


export default function BooksDisplay(){
    return(
    <table className='bg-gray-400'>
        <thead>
            <th>Ranking</th>
            <th>Name</th>
            <th>Author</th>
            <th>Genre</th>
            <th>Price</th>
        </thead>

        <tbody>
        <tr>
          <td className="border p-2">1</td>
          <td className="border p-2">Berserk</td>
          <td className="border p-2">Kentaro Miura</td>
          <td className="border p-2">Seinen</td>
          <td className="border p-2">$299</td>
        </tr>
      </tbody>
    </table>
    )
}