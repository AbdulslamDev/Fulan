# Fulan

Realistic, reproducible Saudi test data for Java. Zero dependencies, Java 17+.

> **Status: data and an early skeleton.** The Java in this repository does not compile yet. The design
> is written and the data is in place; the code is being written against it. Nothing here is usable as
> a library today.

## What it will do

```java
Fulan fulan = new Fulan(42);          // same seed, same output, on any OS, JDK and locale

Name name     = fulan.name().male();  // name.ar(), name.en()
Person person = fulan.person().generate();
```

A generated person is internally consistent: the family name fits the region, the ID type fits the
nationality, the address belongs to the city, and the email is built from the name.

## What is here now

| Path | Contents |
|---|---|
| `src/main/resources/data/` | 49 CSV files: Saudi names, cities, districts, streets, banks, carriers, holidays, company data, and name pools for 15 other nationalities. |

## Data

Weights are coarse tiers chosen by the author, not counts. Family-name regions are generation hints,
not genealogical claims. Several facts are still unverified and are tracked with a confidence grade and a re-check date.

**Generated identifiers are not fictional.** A generated national ID or mobile number can belong to
a real person. Use this data for testing only.

## Licence

Apache License 2.0. See [`LICENSE`](LICENSE).
