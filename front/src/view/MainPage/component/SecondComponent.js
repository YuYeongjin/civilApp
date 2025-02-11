// React
import React from "react";
// External Libraries

export default function SecondComponent({ color }) {
    return (
        <div
            className="bg-info vh-25 w-100"
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