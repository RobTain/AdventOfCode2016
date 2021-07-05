$content = Get-Content -Path C:\Users\robso\Documents\GitHub\AdventOfCode2015\src\day01\input 
$countFloorUp = ($content.ToCharArray() | Where-Object {$_ -eq '('} | Measure-Object).Count
$countFloorDown = ($content.ToCharArray() | Where-Object {$_ -eq ')'} | Measure-Object).Count

Write-Host "Solution:" ($countFloorUp - $countFloorDown)