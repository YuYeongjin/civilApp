// React
import React from "react";
// External Libraries

export default function FirstComponent({ color }) {
    return (
        <div
            style={{ height: '20vh', width: '80vw', backgroundColor: 'green', }}
        >
            <div
                style={{
                    mt: 'auto'
                }}

            >

                <p fontWeight='500'>
                    컴포넌트
                </p>
            </div>
        </div>
    );
}