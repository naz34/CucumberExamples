package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/sdurmus/IdeaProjec/CucumberExamples/src/test/resources/features", // Feature dosyalarının yolu
        glue = "stepdefinations",                // Step definitions'ın yolu
        plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber.json"},
        monochrome = true,                       // Konsol çıktısını okunabilir hale getirir
        dryRun = false                           // true: Eksik step definition'ları kontrol eder, false: Testleri çalıştırır
)

public class Runner {


}
