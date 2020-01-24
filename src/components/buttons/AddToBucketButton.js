import React, {useState} from 'react';
import {Button, ButtonGroup, ModalFooter} from 'reactstrap';
import "./styles/styles.scss"


const AddToBucketButton = (props) => {
    const {} = props;

    return (
        <Button className={"addToBucketButton"}>Добавить в
            корзину</Button>
    )
};
export default AddToBucketButton;
