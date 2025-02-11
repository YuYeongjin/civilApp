// React
import React, { useState, useEffect } from "react";
// External Libraries
import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet';
import 'leaflet/dist/leaflet.css';


export default function FirstComponent({ currentTime }) {

    return (
        <div
            className="bg-success"
        >
            <div
                className="d-flex"
            >
                <MapContainer center={[35.9078, 127.7669]} zoom={7} style={{ height: "500px", width: "300px" }}>
                    <TileLayer
                        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                    />
                    <Marker position={[37.5665, 126.9780]}>
                        <Popup>Seoul</Popup>
                    </Marker>
                </MapContainer>
                <div style={{
                    border: '1px solid gray'
                }}>
                    <p>
                        현재 시각
                    </p>
                    <p>{currentTime.toLocaleString()}</p>
                </div>
            </div>
        </div>
    );
}