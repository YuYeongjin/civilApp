// React
import React from "react";
// External Libraries
import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet';
import 'leaflet/dist/leaflet.css';


export default function FirstComponent({ color }) {
    return (
        <div
            style={{  backgroundColor: 'green', }}
        >
            <div
                style={{
                    mt: 'auto'
                }}

            >

                <MapContainer center={[35.9078, 127.7669]} zoom={7} style={{ height: "500px", width: "300px" }}>
                    <TileLayer
                        url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                        attribution='&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
                    />
                    <Marker position={[37.5665, 126.9780]}>
                        <Popup>Seoul</Popup>
                    </Marker>
                </MapContainer>
            </div>
        </div>
    );
}