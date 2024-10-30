import './css/App.css';
import Footer from './view/component/Footer';
import Sidebar from './view/component/Sidebar';
import Topbar from './view/component/Topbar';
import MainPage from './view/MainPage';
function App() {
  return (
    <>
      <Topbar />

      <div
        style={{
          display: 'flex'
        }}
      >
        <Sidebar />
        <MainPage />
      </div>
      <Footer />
    </>
  );
}

export default App;
