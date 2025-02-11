// React
import React from "react";
// External Libraries

export default function Sidebar({ color }) {
    return (
        <div
            className='sidebar w-10 bg-primary'
        >
            <div
                className="flex-column fw-bold text-white "
            >
                <p>
                    HOME
                </p>
                <p >
                    안전 진단
                </p>
                <p>
                    위험 분석
                </p>
                <p>
                    모니터링
                </p>
                <p >
                    프로젝트
                </p>
                <p>
                    리포트
                </p>
            </div>
        </div>
    );
}