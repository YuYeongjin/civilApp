// React
import React from "react";
// External Libraries

export default function Topbar({ setPageComponent, user }) {
  return (
    <div
      style={{ margin: '0', height: '10vh', width: '100vw', backgroundColor: 'blue', position: 'relative', left: '0', top: '0' }}
    >
      <div
        style={{
          display: 'flex',
          justifyContent: 'space-evenly'
        }}
      >
        <div
          onClick={() => setPageComponent('')}
        >
          <h2 style={{
            marginBottom: '2px',
          }}>
            SCD
          </h2>
          <p style={{
            fontSize: '12px',
            margin: '0'
          }}>
            Smart Civil Dashboard
          </p>
        </div>
        <p
          style={{
            fontWeight: '700',
          }}
        >
          Notice
        </p>
        <p
          style={{
            fontWeight: '700',
          }}
          onClick={() => setPageComponent('mypage')}
        >
          마이페이지
        </p>
        <p
          style={{
            fontWeight: '700',
          }}
          onClick={() => setPageComponent('login')}
        >
          {user ? "로그아웃" : "로그인"}
        </p>
      </div>
    </div>
  );
}