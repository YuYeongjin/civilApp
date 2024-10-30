// React
import React from "react";
// External Libraries

export default function Sidebar({ color }) {
    return (
        <div
            style={{ margin: '0', height: '90vh', width: '10vh', backgroundColor: 'blue', position: 'relative' }}
        >
            <div
                style={{
                    mt: 'auto'
                }}

            >

                <p
                    style={{
                        fontWeight: '700',
                        margin: '0'
                    }}
                >
                    사이드 바 예정입니다.
                </p>
            </div>
        </div>
    );
}