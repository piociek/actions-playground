const core = require('@actions/core')
const github = require('@actions/github')
const exec = require('@actions/exec')

function run() {
    const inputVal = core.getInput('simple-input', {required: true})

    exec.exec('echo " Just an example execution of echo with val <inputVal> "')

    core.notice('Just a test from JS action. Input {}' + inputVal);
}

run();