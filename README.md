# Description
The groovy script can be used to read each line from the CSV file. The sample input file consist of "KeyId", "City" and "Country" and the end user will specify the KeyId in the request url as shown in https://github.com/Axway-API-Management-Plus/Extract-a-Particular-Value-from-CSV-File/blob/master/Readme/Screenshot_4.PNG "Screenshot4". 

The policy script filter can then check if the user entered value exists in the input CSV file. If the value exists then it will show the complete line with KeyId,City and Country.
If the file is not found then it will copy the error trace into API Gateway attribute and show it in the browser. 


## API Management Version Compatibilty
This artefact was successfully tested for the following versions:
- 7.5.1
- 7.5.3

## Install

Sample Policy to check CSV file for user entered value
[Screenshot1]: https://github.com/Axway-API-Management-Plus/Extract-a-Particular-Value-from-CSV-File/blob/master/Readme/Screenshot_1.PNG  "Screenshot1"
[Screenshot2]: https://github.com/Axway-API-Management-Plus/Extract-a-Particular-Value-from-CSV-File/blob/master/Readme/Screenshot_2.PNG  "Screenshot2"   
[Screenshot3]: https://github.com/Axway-API-Management-Plus/Extract-a-Particular-Value-from-CSV-File/blob/master/Readme/Screenshot_3.PNG  "Screenshot3"


## Usage

Copy the input.csv in your local drive
[input.csv]: https://github.com/Axway-API-Management-Plus/Extract-a-Particular-Value-from-CSV-File/blob/master/Readme/input.csv "input.csv" 
Also, change the file path in the src code as shown
[changefilepath]: https://github.com/Axway-API-Management-Plus/Extract-a-Particular-Value-from-CSV-File/blob/master/Readme/changepath.png "changepath.png" 
  

## Bug and Caveats

Nothing identified yet

## Contributing

Please read [Contributing.md] (https://github.com/Axway-API-Management/Common/blob/master/Contributing.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Team

![alt text][Axwaylogo] Axway Team

[Axwaylogo]: https://github.com/Axway-API-Management/Common/blob/master/img/AxwayLogoSmall.png  "Axway logo"


## License
Apache License 2.0 (refer to document [license] (/LICENSE))