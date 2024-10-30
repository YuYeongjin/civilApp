// React
import React from "react";
// External Libraries

export default function Footer({ color }) {
  return (
    <div
      style={{ margin: '0', height: '10vh', width: '100vw', backgroundColor: 'blue', position: 'relative', left: '0', top: '10vh' }}
    >
      <div
        style={{
          mt: 'auto'
        }}

      >

        <p fontWeight='500'>
          하단 바 예정입니다.
        </p>
      </div>
    </div>
  );
}