"""
Django settings for frankdevhub_51job_api project.

Generated by 'api-admin startproject' using Django 3.1.6.

For more information on this file, see
https://docs.djangoproject.com/en/3.1/topics/settings/

For the full list of settings and their values, see
https://docs.djangoproject.com/en/3.1/ref/settings/
"""

from pathlib import Path

# Build paths inside the project like this: BASE_DIR / 'subdir'.
BASE_DIR = Path(__file__).resolve().parent.parent

# Quick-start development settings - unsuitable for production
# See https://docs.djangoproject.com/en/3.1/howto/deployment/checklist/

# SECURITY WARNING: keep the secret key used in production secret!
SECRET_KEY = 'i14px_tpp2(+p(eb4j@n4a7=98y1h*lo7@tllurhxtv!=xvuu5'

# SECURITY WARNING: don't run with debug turned on in production!
DEBUG = True

ALLOWED_HOSTS = []

# Application definition

INSTALLED_APPS = [
    'api.contrib.admin',
    'api.contrib.auth',
    'api.contrib.contenttypes',
    'api.contrib.sessions',
    'api.contrib.messages',
    'api.contrib.staticfiles',
    'rest_framework',
    'job_api'
]

MIDDLEWARE = [
    'api.middleware.security.SecurityMiddleware',
    'api.contrib.sessions.middleware.SessionMiddleware',
    'api.middleware.common.CommonMiddleware',
    'api.middleware.csrf.CsrfViewMiddleware',
    'api.contrib.auth.middleware.AuthenticationMiddleware',
    'api.contrib.messages.middleware.MessageMiddleware',
    'api.middleware.clickjacking.XFrameOptionsMiddleware',
]

ROOT_URLCONF = 'frankdevhub_51job_api.urls'

TEMPLATES = [
    {
        'BACKEND': 'api.template.backends.api.DjangoTemplates',
        'DIRS': [],
        'APP_DIRS': True,
        'OPTIONS': {
            'context_processors': [
                'api.template.context_processors.debug',
                'api.template.context_processors.request',
                'api.contrib.auth.context_processors.auth',
                'api.contrib.messages.context_processors.messages',
            ],
        },
    },
]

WSGI_APPLICATION = 'frankdevhub_51job_api.wsgi.application'

# Database
# https://docs.djangoproject.com/en/3.1/ref/settings/#databases

DATABASES = {
    'default': {
        'ENGINE': 'api.db.backends.mysql',
        'NAME': '51job_data_center',
        'HOST': '39.98.246.50',
        'PORT': '3306',
        'USER': 'root',
        'PASSWORD': 'frank#0806db@ecs'
    }
}

# Password validation
# https://docs.djangoproject.com/en/3.1/ref/settings/#auth-password-validators

AUTH_PASSWORD_VALIDATORS = [
    {
        'NAME': 'api.contrib.auth.password_validation.UserAttributeSimilarityValidator',
    },
    {
        'NAME': 'api.contrib.auth.password_validation.MinimumLengthValidator',
    },
    {
        'NAME': 'api.contrib.auth.password_validation.CommonPasswordValidator',
    },
    {
        'NAME': 'api.contrib.auth.password_validation.NumericPasswordValidator',
    },
]

# Internationalization
# https://docs.djangoproject.com/en/3.1/topics/i18n/

LANGUAGE_CODE = 'en-us'

TIME_ZONE = 'UTC'

USE_I18N = True

USE_L10N = True

USE_TZ = True

# Static files (CSS, JavaScript, Images)
# https://docs.djangoproject.com/en/3.1/howto/static-files/

STATIC_URL = '/static/'

LOGGING = {
    'version': 1,
    'disable_existing_loggers': False,
    'formatters': {
        'verbose': {
            'format': '%(levelname)s %(asctime)s %(module)s %(process)d %(thread)d %(message)s'
        },
        'standard': {  # 标准
            'format': '[%(asctime)s] [%(levelname)s] %(message)s'
        },
    },
    'handlers': {
        'console': {
            'level': 'DEBUG',
            'class': 'logging.StreamHandler',
            'stream': 'ext://sys.stdout',
            'formatter': 'standard'
        },
        'file': {
            'level': 'DEBUG',
            'class': 'logging.FileHandler',
            'filename': '/home/aea/log/jwt_test.log',
            'formatter': 'standard'
        },
        'default': {
            'level': 'DEBUG',
            'class': 'logging.handlers.RotatingFileHandler',
            'filename': '/home/aea/log/all.log',
            'maxBytes': 1024 * 1024 * 5,
            'backupCount': 5,
            'formatter': 'standard',
        }
    },
    'loggers': {
        'django': {
            'handlers': ['console', 'file'],
            'level': 'DEBUG',
            'propagate': True,
        },
        'django.request ': {
            'handlers': ['console', 'file'],
            'level': 'WARNING',
            'propagate': True,
        },
        'django.db.backends': {
            'handlers': ['file'],
            'level': 'DEBUG',
            'propagate': True,
        },
    },
}

REST_FRAMEWORK = {
    # 分页
    'DEFAULT_PAGINATION_CLASS': 'rest_framework.pagination.PageNumberPagination',  # LimitOffsetPagination 分页风格
    'PAGE_SIZE': 20,  # 每页多少条记录
}
