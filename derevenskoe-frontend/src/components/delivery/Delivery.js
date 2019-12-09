import React, {Component} from 'react';
import {Container} from '@material-ui/core';

class Delivery extends Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            <Container>
                <div>
                    <h1>Доставка и оплата</h1>
                    <p><b>Доставка продуктов осуществляется пять дней в неделю(в будние дни): с 15 до 21 часов</b></p>
                </div>
            </Container>
        )
    }


}

export default Delivery;