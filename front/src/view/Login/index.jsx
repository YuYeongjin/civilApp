// React
import React, { useState, useEffect } from "react";
// External Libraries
import axios from 'axios';

export default function LoginPage({ }) {

    const [text, setText] = useState();

    useEffect(() => {
        axios.post("/api/user/main")
            .then((response) => {
                setText(response.data.result);
            })
            .catch((error) => {

            })
    }, [])

    return (

        <>

            <div
                style={{
                    position: 'relative'
                }}>

                <p style={{ color: 'white' }}>
                    로그인 페이지 입니다.
                </p>
            </div>
        </>

    );
}
