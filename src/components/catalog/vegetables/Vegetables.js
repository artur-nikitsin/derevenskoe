import React, {Component} from 'react';
import {Container} from '@material-ui/core';
import ProductCard from "../productCard/ProductCard";

/*Mock for AJAX*/

/*import "../../../../public/json/vegetables.json"*/


class Vegetables extends Component {


    constructor(props) {
        super(props);
        this.state = {
            products: []
        };
    }

    componentDidMount() {

        let jsonToState = (data) => {
            this.setState({products: data});
        };


        fetch(`/json/vegetables.json`)
            .then(
                res => {
                    if (res.status !== 200) {
                        console.log('Looks like there was a problem. Status Code: ' +
                            res.status);
                        return;
                    }
                    res.json().then(function (data) {
                        jsonToState(data)
                    });

                }
            )
            .catch(function (err) {
                console.log('Fetch Error :-S', err);
            });

    }


    render() {


        console.log(this.state);

        return (
            <Container>
                <div><p>Vegetables</p></div>
                <ProductCard/>
            </Container>
        );
    }

}

export default Vegetables;