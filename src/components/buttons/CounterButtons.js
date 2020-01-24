import React, {useState} from 'react';
import {Button, ButtonGroup} from 'reactstrap';
import "./styles/styles.scss"


const CounterButtons = (props) => {
    const {
    } = props;

    const [count, setCount] = useState(0);

    const setLowCount = () => {
        if (count > 0) {
            setCount(count - 1)
        }
    };

    const setUpCount = () => {
        setCount(count + 1)
    };

    return (
        <div>
            <ButtonGroup>
                <Button className={"setCountButtons"} outline onClick={setLowCount}>-</Button>
                <Button className={"counterInput"} outline>{count}</Button>
                <Button className={"setCountButtons"} outline onClick={setUpCount}>+</Button>
            </ButtonGroup>
        </div>)

};
export default CounterButtons;
