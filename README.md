# Description
The sample input file consist of "KeyId", "City" and "Country"

![alt text][inputCSV]

End user will specify the KeyId in the request url as shown below
![alt text][Screenshot4]

The policy script filter can then check if the user entered value exists in the input CSV file. If the value exists then it will show the complete line with KeyId,City and Country.

If the file is not found then it will copy the error trace into API Gateway attribute and show it in the browser as shown below

![alt text][Screenshot5]

## API Management Version Compatibilty
This artefact was successfully tested for the following versions:
- 7.5.1
- 7.5.3

## Install

Sample policy

![alt text][Screenshot1]

![alt text][Screenshot2]

![alt text][Screenshot3]

## Usage

Copy the input.csv in your local drive

Also, change the file path in the src code as shown

![alt text][changepath]

## Bug and Caveats

Nothing identified yet

## Contributing

Please read [Contributing.md] (https://github.com/Axway-API-Management/Common/blob/master/Contributing.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Team

![alt text][Axwaylogo] Axway Team

[Axwaylogo]: https://github.com/Axway-API-Management/Common/blob/master/img/AxwayLogoSmall.png  "Axway logo"


## License
Apache License 2.0 (refer to document [license] (https://github.com/Axway-API-Management-Plus/Extract-a-Particular-Value-from-CSV-File/blob/master/LICENSE)

[inputCSV]: https://github.com/Axway-API-Management-Plus/Extract-a-Particular-Value-from-CSV-File/blob/master/Readme/inputCSV.PNG "Input CSV"

[Screenshot5]:https://github.com/Axway-API-Management-Plus/Extract-a-Particular-Value-from-CSV-File/blob/master/Readme/Screenshot_5.PNG "FileNotFound error"

[Screenshot1]: https://github.com/Axway-API-Management-Plus/Extract-a-Particular-Value-from-CSV-File/blob/master/Readme/Screenshot_1.PNG

[Screenshot2]: https://github.com/Axway-API-Management-Plus/Extract-a-Particular-Value-from-CSV-File/blob/master/Readme/Screenshot_2.PNG

[Screenshot3]: https://github.com/Axway-API-Management-Plus/Extract-a-Particular-Value-from-CSV-File/blob/master/Readme/Screenshot_3.PNG

[Screenshot4]: https://github.com/Axway-API-Management-Plus/Extract-a-Particular-Value-from-CSV-File/blob/master/Readme/Screenshot4.PNG

[changepath]: https://github.com/Axway-API-Management-Plus/Extract-a-Particular-Value-from-CSV-File/blob/master/Readme/changepath.png 
