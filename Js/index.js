function highScore(str) {
  function calculateScore(word) {
    let score = 0
    for (let index = 0; index < word.length; index++) {
      score += word[index].charCodeAt(0) - 96
    }
    return score
  }

  const splitStr = str.split(" ")
  const weightedArray = splitStr.map((word) => calculateScore(word))

  let highestScore = 0
  let highestScoreIndex = 0

  weightedArray.forEach((score, index) => {
    if (score > highestScore) {
      highestScoreIndex = index
      highestScore = score
    }
  })

  return splitStr[highestScoreIndex]
}
