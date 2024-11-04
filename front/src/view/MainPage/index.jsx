// React
import React, { useState, useEffect } from "react";
// External Libraries
import axios from 'axios';
import FirstComponent from "./component/FirstComponent";
import SecondComponent from "./component/SecondComponent";

export default function MainDashboard({ }) {

    const [text, setText] = useState();
    const [currentTime, setCurrentTime] = useState(new Date());
    const [callFunction, setCallFunction] = useState(false);

    useEffect(() => {
        const timer = setInterval(() => {
            setCurrentTime(new Date());
        }, 1000);

        return () => clearInterval(timer);
    }, []);
    useEffect(() => {
        if (callFunction) {

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

            setCallFunction(false);
        }

    }, [callFunction])


    return (

        <>

            <div
                style={{
                    position: 'relative'
                }}>

                <button
                    onClick={() => {
                        setCallFunction(true);
                    }}
                    style={{
                        color: 'orange'
                    }}>
                    기상청 api call
                </button>
                <FirstComponent currentTime={currentTime} />
                <SecondComponent />
                <p style={{ color: 'white' }}>
                    {text}
                </p>
            </div>
        </>

    );
}
