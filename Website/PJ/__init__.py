from flask import Flask
from flask.ext.assets import Environment, Bundle


app = Flask(__name__)
app.jinja_env.add_extension('pyjade.ext.jinja.PyJadeExtension')
app.config['PROPAGATE_EXCEPTIONS'] = True

assets = Environment(app)
assets.url = app.static_url_path
assets.register('main_sass',  	Bundle('main.sass', 		filters='sass', output='style.css')  )




from . import views

