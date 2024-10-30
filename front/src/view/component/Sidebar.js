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
                    direction: 'column'
                }}
            >
                <p
                    style={{
                        fontWeight: '700'
                    }}
                >
                    HOME
                </p>
                <p
                    style={{
                        fontWeight: '700'
                    }}
                >
                    안전 진단
                </p>
                <p
                    style={{
                        fontWeight: '700'
                    }}
                >
                    위험 분석
                </p>
                <p
                    style={{
                        fontWeight: '700'
                    }}
                >
                    모니터링
                </p>
                <p
                    style={{
                        fontWeight: '700'
                    }}
                >
                    프로젝트
                </p>
                <p
                    style={{
                        fontWeight: '700'
                    }}
                >
                    리포트
                </p>
            </div>
        </div>
    );
}