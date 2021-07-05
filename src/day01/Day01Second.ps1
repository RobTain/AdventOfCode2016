$content = Get-Content -Path C:\Users\robso\Documents\GitHub\AdventOfCode2015\src\day01\input 
$count = 0;
$floor = 0;

$content = $content.ToCharArray()


foreach ($letter in $content) {
    if ($letter -eq "(") {
        $floor++
    } else {
        $floor--
    }

    $count++

    if ($floor -eq -1) {
        break
    }

}

Write-Host "Solution:" $count