import React, { Component } from 'react';
import axios from "axios";


export class Prize extends Component {

        constructor() {
        super();
        this.state = {
            message: ""
        };
    }
    makeRequest = (e) => {
        e.preventDefault();

        const {
    id
} = this.props
        axios
            .delete("/producer/user/deleteOne/" + id)
            .then(response => {
                console.log("deleted account")
                window.alert("Delete item?")
                this.props.passedFunction();
            });
    };

    getPrize = (e) => {
        e.preventDefault();
this.setState({ message: "prize: " + this.props.prize });
    }

    render() {
        return (
            <div>
                <div className="formDiv">
                    <p>FirstName: {this.props.firstname}</p>
                    <p>Lastname: {this.props.lastname}</p>
                    <p className="getPrize">{this.state.message}</p>
                    <br />
                    <br />
                    <button className="btn btn-dark" onClick={this.makeRequest}>Delete</button>
                    <br />
                    <br />
                    <form onSubmit={this.getPrize}>
                        <input type="submit" className="btn btn-dark" value="get prize" />
                    </form>
                </div>


            </div>

        );
    }
}
