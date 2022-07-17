import React, { useEffect, useState } from "react";
import axios, {AxiosResponse} from "axios";

interface Users {
    id : number;
    firstName: string;
    lastName: string;
    email: string;
}

export function UserComponent(){

    const URL = 'http://localhost:8080/'

    const [users, setUsers] = useState<Users[]>([]);

    useEffect(()=>{
        axios.get(`${URL}api/users`).then((response : AxiosResponse) => {
            setUsers(response.data)
        })
    }, []);

    console.log(users)
    return (
        <div>
            <h1>Users List</h1>
            <table border={1}>
                <thead>
                    <tr>
                        <td>User Id</td>
                        <td>User First Name</td>
                        <td>User Last Name</td>
                        <td>User Email</td>
                    </tr>
                </thead>
                <tbody>
                    {
                        users.map(user => (
                            <tr key={user.id}>
                                <td>{user.id}</td>
                                <td>{user.firstName}</td>
                                <td>{user.lastName}</td>
                                <td>{user.email}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
        </div>
    );
}