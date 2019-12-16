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
                    <p><b>Заказы на понедельник</b> принимаем до 23:59 пятницы(а также в субботу и воскресенье)</p>
                    <p><b>Заказы на вторник</b> принимаем до 23:59 понедельника</p>
                    <p><b>Заказы на среду</b> принимаем до 23:59 вторника</p>
                    <p><b>Заказы на четверг</b> принимаем до 23:59 среды</p>
                    <p><b>Заказы на пятницу</b> принимаем до 23:59 четверга</p>

                </div>
            </Container>
        )
    }


}

export default Delivery;