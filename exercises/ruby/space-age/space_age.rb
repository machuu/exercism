class SpaceAge
  # Orbital periods in units of Earth Years
  SECONDS_PER_EARTH_YEAR = 31557600.0
  YEAR_LENGTH_ON_PLANET = {
    mercury: 0.2408467,
    venus:   0.61519726,
    earth:   1.0,
    mars:    1.8808158,
    jupiter: 11.862615,
    saturn:  29.447498,
    uranus:  84.016846,
    neptune: 164.79132,
  }

  def initialize(age_in_seconds)
    @age_in_seconds = age_in_seconds
    @age_in_earth_years = (age_in_seconds / SECONDS_PER_EARTH_YEAR).round(2)
  end

  def on_mercury
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:mercury]
  end

  def on_venus
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:venus]
  end

  def on_earth
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:earth]
  end

  def on_mars
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:mars]
  end

  def on_jupiter
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:jupiter]
  end

  def on_saturn
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:saturn]
  end

  def on_uranus
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:uranus]
  end

  def on_neptune
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:neptune]
  end
end
