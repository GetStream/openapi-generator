# openapi-client
Echo Server API

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 0.1.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.PythonNextgenClientCodegen

## Requirements.

Python 3.7+

## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import openapi_client
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import openapi_client
```

### Tests

Execute `pytest` to run the tests.

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function

import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:3000
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost:3000"
)



# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.BodyApi(api_client)

    try:
        # Test binary (gif) response body
        api_response = api_instance.test_binary_gif()
        print("The response of BodyApi->test_binary_gif:\n")
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling BodyApi->test_binary_gif: %s\n" % e)

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:3000*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BodyApi* | [**test_binary_gif**](docs/BodyApi.md#test_binary_gif) | **POST** /binary/gif | Test binary (gif) response body
*BodyApi* | [**test_echo_body_pet**](docs/BodyApi.md#test_echo_body_pet) | **POST** /echo/body/Pet | Test body parameter(s)
*BodyApi* | [**test_echo_body_pet_response_string**](docs/BodyApi.md#test_echo_body_pet_response_string) | **POST** /echo/body/Pet/response_string | Test empty response body
*FormApi* | [**test_form_integer_boolean_string**](docs/FormApi.md#test_form_integer_boolean_string) | **POST** /form/integer/boolean/string | Test form parameter(s)
*HeaderApi* | [**test_header_integer_boolean_string**](docs/HeaderApi.md#test_header_integer_boolean_string) | **GET** /header/integer/boolean/string | Test header parameter(s)
*PathApi* | [**tests_path_string_path_string_integer_path_integer**](docs/PathApi.md#tests_path_string_path_string_integer_path_integer) | **GET** /path/string/{path_string}/integer/{path_integer} | Test path parameter(s)
*QueryApi* | [**test_query_datetime_date_string**](docs/QueryApi.md#test_query_datetime_date_string) | **GET** /query/datetime/date/string | Test query parameter(s)
*QueryApi* | [**test_query_integer_boolean_string**](docs/QueryApi.md#test_query_integer_boolean_string) | **GET** /query/integer/boolean/string | Test query parameter(s)
*QueryApi* | [**test_query_style_deep_object_explode_true_object**](docs/QueryApi.md#test_query_style_deep_object_explode_true_object) | **GET** /query/style_deepObject/explode_true/object | Test query parameter(s)
*QueryApi* | [**test_query_style_deep_object_explode_true_object_all_of**](docs/QueryApi.md#test_query_style_deep_object_explode_true_object_all_of) | **GET** /query/style_deepObject/explode_true/object/allOf | Test query parameter(s)
*QueryApi* | [**test_query_style_form_explode_true_array_string**](docs/QueryApi.md#test_query_style_form_explode_true_array_string) | **GET** /query/style_form/explode_true/array_string | Test query parameter(s)
*QueryApi* | [**test_query_style_form_explode_true_object**](docs/QueryApi.md#test_query_style_form_explode_true_object) | **GET** /query/style_form/explode_true/object | Test query parameter(s)
*QueryApi* | [**test_query_style_form_explode_true_object_all_of**](docs/QueryApi.md#test_query_style_form_explode_true_object_all_of) | **GET** /query/style_form/explode_true/object/allOf | Test query parameter(s)


## Documentation For Models

 - [Bird](docs/Bird.md)
 - [Category](docs/Category.md)
 - [DataQuery](docs/DataQuery.md)
 - [DataQueryAllOf](docs/DataQueryAllOf.md)
 - [DefaultValue](docs/DefaultValue.md)
 - [Pet](docs/Pet.md)
 - [Query](docs/Query.md)
 - [StringEnumRef](docs/StringEnumRef.md)
 - [Tag](docs/Tag.md)
 - [TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter](docs/TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.md)
 - [TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter](docs/TestQueryStyleFormExplodeTrueArrayStringQueryObjectParameter.md)


## Documentation For Authorization

 All endpoints do not require authorization.

## Author

team@openapitools.org


