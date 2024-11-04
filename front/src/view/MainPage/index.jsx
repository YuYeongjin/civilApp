// React
import React, { useState, useEffect } from "react";
// External Libraries
import axios from 'axios';
import FirstComponent from "./component/FirstComponent";
import SecondComponent from "./component/SecondComponent";

export default function MainPage({ }) {

    const [text, setText] = useState();

    useEffect(() => {
        axios.post("http://localhost:7050/api/user/main")
            .then((response) => {
                setText(response.data.result);
            })
            .catch((error) => {
                console.log(error);
            })
        axios.post("http://localhost:7050/api/weather/getInfo", {

        })
            .then((responses) => {
                console.log(responses);
            })
            .catch((error) => {
                console.log(error);
            })


    }, [])


    return (

        <>

            <div
                style={{
                    position: 'relative'
                }}>

                <FirstComponent />
                <SecondComponent />
                <p style={{ color: 'white' }}>
                    {text}
                </p>
            </div>
        </>

    );
}
