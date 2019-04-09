class SpaceAge
  # Orbital periods in units of Earth Years
  SECONDS_PER_EARTH_YEAR = 31557600.0
  YEAR_LENGTH_ON_PLANET = {
    on_mercury: 0.2408467,
    on_venus:   0.61519726,
    on_earth:   1.0,
    on_mars:    1.8808158,
    on_jupiter: 11.862615,
    on_saturn:  29.447498,
    on_uranus:  84.016846,
    on_neptune: 164.79132,
  }

  def initialize(age_in_seconds)
    @age_in_seconds = age_in_seconds
    @age_in_earth_years = (age_in_seconds / SECONDS_PER_EARTH_YEAR).round(2)
  end

  def on_mercury
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:on_mercury]
  end

  def on_venus
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:on_venus]
  end

  def on_earth
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:on_earth]
  end

  def on_mars
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:on_mars]
  end

  def on_jupiter
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:on_jupiter]
  end

  def on_saturn
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:on_saturn]
  end

  def on_uranus
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:on_uranus]
  end

  def on_neptune
    return @age_in_earth_years / YEAR_LENGTH_ON_PLANET[:on_neptune]
  end
end
