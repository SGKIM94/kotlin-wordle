package wordle.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ResultsTest {

    @Test
    fun `기존에_존재하는_결과타일에_타일결과를_추가한다`() {
        val results = ResultTiles()

        val firstCombined = results.combine(Tiles(listOf(Tile.YELLOW, Tile.YELLOW, Tile.YELLOW, Tile.GRAY, Tile.YELLOW)))
        val secondCombined = firstCombined.combine(Tiles(listOf(Tile.GREEN, Tile.GRAY, Tile.GREEN, Tile.GRAY, Tile.YELLOW)))

        assertThat(secondCombined.resultTiles).containsExactly(
            Tiles(listOf(Tile.YELLOW, Tile.YELLOW, Tile.YELLOW, Tile.GRAY, Tile.YELLOW)),
            Tiles(listOf(Tile.GREEN, Tile.GRAY, Tile.GREEN, Tile.GRAY, Tile.YELLOW))
        )
    }
}
