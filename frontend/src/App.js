import REACT_APP_API_KEY from "./api";
import axios from 'axios';

function App() {

  const onClickHandler = () => {
    axios.get("/api/getKey")
      .then(response => {
        alert(response.data);
      });
  }

  return (
    <>
      <div style={{fontSize: 24}}>
        전달된 REACT_APP_API_KEY = {REACT_APP_API_KEY}
      </div>
      <div>
        <button onClick={onClickHandler}>SPRING API KEY 요청</button>
      </div>
    </>
  );

}

export default App;
