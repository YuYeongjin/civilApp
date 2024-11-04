import React, { useEffect, useState } from 'react';
import './css/App.css';
import Footer from './view/component/Footer';
import Sidebar from './view/component/Sidebar';
import Topbar from './view/component/Topbar';
import LoginPage from './view/login';
import MyPage from './view/myPage';
import MainPage from './view/mainPage';

function App() {
  const [pageComponent, setPageComponent] = useState();

  const [user, setUser] = useState();

  return (
    <>
      <Topbar setPageComponent={setPageComponent} user={user} />

      {
        pageComponent === 'login' ?
          <LoginPage />
          :

          <div
            style={{
              display: 'flex'
            }}
          >
            <Sidebar />
            {
              pageComponent === 'mypage' ?
                <MyPage />
                :
                <MainPage />
            }
          </div>
      }

      <Footer />
    </>
  );
}

export default App;
