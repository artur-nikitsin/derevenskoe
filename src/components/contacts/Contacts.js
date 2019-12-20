import React, {Component} from 'react';
import {connect} from 'react-redux'
import {Container} from '@material-ui/core';


class Contacts extends Component {

    constructor(props) {
        super(props);
    }

    render() {


        return (
            <Container>
                <h1>Контакты</h1>
                <p>
                    <br/>Руководитель: ИП Икон Никита Александрович
                    <br/>УНП: 690861077


                    <br/><b>Телефон:</b>
                    <br/>8 (029) 167-84-33
                    <br/><b>Расчетный счет:</b>
                    <br/>ЦБУ №611 филиала №500- МУ ОАО "АСБ Беларусьбанк" в г. Логойске 223141 г.Логойск,
                    ул.Пролетарская,1 УНП: 100603596
                    <br/>МФО АКВВВY21500
                </p>


            </Container>
        );
    }

}

export default Contacts;