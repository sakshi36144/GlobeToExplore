package com.exmin.globetoexplore.UserRegistrationScreen

import androidx.compose.animation.expandIn
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.LookaheadScope
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.exmin.globetoexplore.R
import kotlinx.coroutines.sync.Mutex
import org.intellij.lang.annotations.JdkConstants
import java.nio.file.WatchEvent

@Composable
@Preview(showSystemUi = true)

fun userregistrationscreen() {
    var exended by remember {
        mutableStateOf(false)
    }
    var selectedCount by remember {
        mutableStateOf("japan")
    }
    var countrycode by remember {
        mutableStateOf("+81")
    }
    var phonenumber by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize().background(Color(0xFFFFDEAD)).padding(19.dp),
    horizontalAlignment = Alignment.CenterHorizontally
    )
    {  Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Enter your Phone Number",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = colorResource(R.color.maroon)
        )

        Spacer(modifier = Modifier.height(18.dp))
        Row {
            Text(text = "GlobeExplore will need to verify your phone number")
            Spacer(modifier = Modifier.height(18.dp))
            Text(text = "what's", color = colorResource(R.color.maroon))
        }
        Text(text = "My number?", color = colorResource(R.color.maroon))


        TextButton(onClick = { exended = true }, modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.width(230.dp)) {
                Text(
                    text = selectedCount,
                    modifier = Modifier.align(Alignment.Center),
                    fontSize = 30.sp,
                    color = Color.Black
                )
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    modifier = Modifier.align(Alignment.CenterEnd),
                    tint = colorResource(id = R.color.maroon)
                )
            }
        }
        HorizontalDivider(
            modifier = Modifier.padding(horizontal = 66.dp),
            thickness = 3.dp,
            color = colorResource(id = R.color.maroon)
        )
        DropdownMenu(expanded = exended, onDismissRequest = { exended = false }) {
            listOf(
                "Afghanistan",
                "Albania",
                "Algeria",
                "Andorra",
                "Angola",
                "Antigua and Barbuda",
                "Argentina",
                "Armenia",
                "Australia",
                "Austria",
                "Azerbaijan",
                "Bahamas",
                "Bahrain",
                "Bangladesh",
                "Barbados",
                "Belarus",
                "Belgium",
                "Belize",
                "Benin",
                "Bhutan",
                "Bolivia",
                "Bosnia and Herzegovina",
                "Botswana",
                "Brazil",
                "Brunei",
                "Bulgaria",
                "Burkina Faso",
                "Burundi",
                "Cabo Verde\n" +
                        "Cambodia\n" +
                        "Cameroon\n" +
                        "Canada\n" +
                        "Central African Republic\n" +
                        "Chad\n" +
                        "Chile\n" +
                        "China\n" +
                        "Colombia\n" +
                        "Comoros\n" +
                        "Congo, Democratic Republic of the\n" +
                        "Congo, Republic of the\n" +
                        "Costa Rica\n" +
                        "Cote d'Ivoire\n" +
                        "Croatia\n" +
                        "Cuba\n" +
                        "Cyprus\n" +
                        "Czechia\n" +
                        "Denmark\n" +
                        "Djibouti\n" +
                        "Dominica\n" +
                        "Dominican Republic\n" +
                        "E\n" +
                        "Ecuador\n" +
                        "Egypt\n" +
                        "El Salvador\n" +
                        "Equatorial Guinea\n" +
                        "Eritrea\n" +
                        "Estonia\n" +
                        "Eswatini\n" +
                        "Ethiopia\n" +
                        "F\n" +
                        "Fiji\n" +
                        "Finland\n" +
                        "France\n" +
                        "G\n" +
                        "Gabon\n" +
                        "Gambia\n" +
                        "Georgia\n" +
                        "Germany\n" +
                        "Ghana\n" +
                        "Greece\n" +
                        "Grenada\n" +
                        "Guatemala\n" +
                        "Guinea\n" +
                        "Guinea-Bissau\n" +
                        "Guyana\n" +
                        "H\n" +
                        "Haiti\n" +
                        "Honduras\n" +
                        "Hungary\n" +
                        "I\n" +
                        "Iceland\n" +
                        "India\n" +
                        "Indonesia\n" +
                        "Iran\n" +
                        "Iraq\n" +
                        "Ireland\n" +
                        "Israel\n" +
                        "Italy\n" +
                        "J\n" +
                        "Jamaica\n" +
                        "Japan\n" +
                        "Jordan\n" +
                        "K\n" +
                        "Kazakhstan\n" +
                        "Kenya\n" +
                        "Kiribati\n" +
                        "Kosovo\n" +
                        "Kuwait\n" +
                        "Kyrgyzstan\n" +
                        "L\n" +
                        "Laos\n" +
                        "Latvia\n" +
                        "Lebanon\n" +
                        "Lesotho\n" +
                        "Liberia\n" +
                        "Libya\n" +
                        "Liechtenstein\n" +
                        "Lithuania\n" +
                        "Luxembourg\n" +
                        "M\n" +
                        "Madagascar\n" +
                        "Malawi\n" +
                        "Malaysia\n" +
                        "Maldives\n" +
                        "Mali\n" +
                        "Malta\n" +
                        "Marshall Islands\n" +
                        "Mauritania\n" +
                        "Mauritius\n" +
                        "Mexico\n" +
                        "Micronesia\n" +
                        "Moldova\n" +
                        "Monaco\n" +
                        "Mongolia\n" +
                        "Montenegro\n" +
                        "Morocco\n" +
                        "Mozambique\n" +
                        "Myanmar\n" +
                        "N\n" +
                        "Namibia\n" +
                        "Nauru\n" +
                        "Nepal\n" +
                        "Netherlands\n" +
                        "New Zealand\n" +
                        "Nicaragua\n" +
                        "Niger\n" +
                        "Nigeria\n" +
                        "North Korea\n" +
                        "North Macedonia\n" +
                        "Norway\n" +
                        "O\n" +
                        "Oman\n" +
                        "P\n" +
                        "Pakistan\n" +
                        "Palau\n" +
                        "Palestine\n" +
                        "Panama\n" +
                        "Papua New Guinea\n" +
                        "Paraguay\n" +
                        "Peru\n" +
                        "Philippines\n" +
                        "Poland\n" +
                        "Portugal\n" +
                        "Q\n" +
                        "Qatar\n" +
                        "R\n" +
                        "Romania\n" +
                        "Russia\n" +
                        "Rwanda\n" +
                        "S\n" +
                        "Saint Kitts and Nevis\n" +
                        "Saint Lucia\n" +
                        "Saint Vincent and the Grenadines\n" +
                        "Samoa\n" +
                        "San Marino\n" +
                        "Sao Tome and Principe\n" +
                        "Saudi Arabia\n" +
                        "Senegal\n" +
                        "Serbia\n" +
                        "Seychelles\n" +
                        "Sierra Leone\n" +
                        "Singapore\n" +
                        "Slovakia\n" +
                        "Slovenia\n" +
                        "Solomon Islands\n" +
                        "Somalia\n" +
                        "South Africa\n" +
                        "South Korea\n" +
                        "South Sudan\n" +
                        "Spain\n" +
                        "Sri Lanka\n" +
                        "Sudan\n" +
                        "Suriname\n" +
                        "Sweden\n" +
                        "Switzerland\n" +
                        "Syria\n" +
                        "T\n" +
                        "Taiwan\n" +
                        "Tajikistan\n" +
                        "Tanzania\n" +
                        "Thailand\n" +
                        "Timor-Leste\n" +
                        "Togo\n" +
                        "Tonga\n" +
                        "Trinidad and Tobago\n" +
                        "Tunisia\n" +
                        "Turkey\n" +
                        "Turkmenistan\n" +
                        "Tuvalu\n" +
                        "U\n" +
                        "Uganda\n" +
                        "Ukraine\n" +
                        "United Arab Emirates (UAE)\n" +
                        "United Kingdom (UK)\n" +
                        "United States of America (USA)\n" +
                        "Uruguay\n" +
                        "Uzbekistan\n" +
                        "V\n" +
                        "Vanuatu\n" +
                        "Vatican City (Holy See)\n" +
                        "Venezuela\n" +
                        "Vietnam\n" +
                        "Yemen\n",
                "Zambia\n",
                "Zimbabwe"
            ).forEach { country ->
                DropdownMenuItem(text = { Text(text = country) }, onClick = {
                    selectedCount = country
                    exended = false
                })
            }

        }
        Column(
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                TextField(
                    value = countrycode, onValueChange = {
                        countrycode = it
                    }, modifier = Modifier.width(70.dp),
                    singleLine = true,
                    textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,

                        unfocusedIndicatorColor = colorResource(id = R.color.maroon),

                        focusedIndicatorColor = colorResource(id = R.color.maroon)
                    )
                )
                Spacer(modifier = Modifier.width(6.dp))
                TextField(
                    value = phonenumber, onValueChange = { phonenumber = it },
                    placeholder = { Text(text = "phone number") },
                    singleLine = true,
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,

                        unfocusedIndicatorColor = colorResource(id = R.color.maroon),

                        focusedIndicatorColor = colorResource(id = R.color.maroon)
                    )
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Carrier changes may apply",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
            )
            Spacer(modifier = Modifier.height(26.dp))
            Button(
                onClick = {},
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.maroon))
            ) {
                Text(text = "Next", fontSize = 16.sp)
            }
        }
    }

}