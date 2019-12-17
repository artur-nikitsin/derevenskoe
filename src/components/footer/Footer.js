import React, {Component} from 'react';
import {connect} from 'react-redux'
import {Container} from '@material-ui/core';
import "./styles/footer.scss"

class Footer extends Component {

    constructor(props) {
        super(props);
    }

    render() {


        return (

            <div className={"footer"}>
                <Container>
                    <p>© 2019 Все права защищены.</p>
                </Container>
            </div>

        );
    }

}

export default Footer;