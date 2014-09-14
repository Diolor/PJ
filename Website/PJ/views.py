from . import app
from flask import render_template


@app.route('/')
def index():
    return render_template('index.jade')


@app.route('/docs')
def docs():
    return render_template('doc.jade')