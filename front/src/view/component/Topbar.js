// React
import React from "react";
// External Libraries

export default function Topbar({ setPageComponent, user }) {
  return (
    <div
      className="navbar d-flex justify-content-between fw-bold bg-blue"
    >
      <div
        onClick={() => setPageComponent('')}
      >
        <h2 className="mb-2">
          SCD
        </h2>
        <p className="m-0 fs-5" >
          Smart Civil Dashboard
        </p>
      </div>
      <p >
        Notice
      </p>
      <p onClick={() => setPageComponent('mypage')}      >
        마이페이지
      </p>
      <p onClick={() => setPageComponent('login')}
      >
        {user ? "로그아웃" : "로그인"}
      </p>
    </div>
  );
}