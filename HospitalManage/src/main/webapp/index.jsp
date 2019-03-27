<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
</head>
<body>
    <h1>Registration Form</h1>
    <form action="register" method="post">
        <table cellpadding="3pt">
            <tr>
                <td>Patient Id :</td>
                <td><input type="text" name="patientId" size="30" /></td>
            </tr>
            <tr>
                <td>Patient Name :</td>
                <td><input type="text" name="patientName" size="30" /></td>
            </tr>
            <tr>
                <td>Age :</td>
                <td><input type="text" name="age" size="30" /></td>
            </tr>
 
            <tr>
                <td>Blood Group :</td>
                <td><input type="text" name="bloodGroup" size="30" /></td>
            </tr>
            
            <tr>
               <td>Checkup :</td>
               <td><input type="radio" name="checkup" value="IP">IP</input></td><br>
               <td> <input type="radio" name="checkup" value="Emergency">Emergency</input><br></td>
            </tr>
            
            <tr>
               <td>Doctors :</td>              
               <td><select>
               <option value="doctr1">Parth</option>
               <option value="doctr2">Manoj</option>
               <option value="doctr3">Indra</option>
               <option value="doctr4">Neeraj</option>
               </select></td><br>
            </tr>
                     
            <tr>
               <td>Test Recommended :</td>              
               <td><select>
               <option value="test1">MRI</option>
               <option value="test2">ECG</option>
               <option value="test3">Scan</option>
               <option value="test4">BloodTest</option>
               </select></td><br>
            </tr>
            
        </table>
        <p/>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>