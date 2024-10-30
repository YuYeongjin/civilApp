// React
import React from "react";
// External Libraries

export default function Topbar({ color }) {
  return (
    <div
      style={{ margin: '0', height: '10vh', width: '100vw', backgroundColor: 'blue', position: 'relative', left: '0', top: '0' }}
    >
      <div
        style={{
          mb: 'auto'
        }}

      >

        <p
          style={{
            fontWeight: '700',
            margin: '0'
          }}
        >
          상단 바 예정입니다.
        </p>
      </div>
    </div>
  );
}